/*
 * Copyright 2019 Ingo Griebsch
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
package com.github.ingogriebsch.sample.spring.boot.graphql.resolver;

import static com.google.common.collect.Sets.newHashSet;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import com.github.ingogriebsch.sample.spring.boot.graphql.model.Continent;
import com.github.ingogriebsch.sample.spring.boot.graphql.model.Country;
import com.github.ingogriebsch.sample.spring.boot.graphql.repository.CountryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ContinentResolverTest {

    @Mock
    private CountryRepository countryRepository;

    @InjectMocks
    private ContinentResolver continentResolver;

    @Test(expected = NullPointerException.class)
    public void getCountries_should_throw_exception_if_called_with_null() throws Exception {
        continentResolver.getCountries(null);
    }

    @Test
    public void getCountries_should_return_related_countries() throws Exception {
        Continent continent = new Continent("Continent");
        Country country = new Country("Country");

        given(countryRepository.findByContinentId(continent.getId())).willReturn(newHashSet(country));

        Iterable<Country> countries = continentResolver.getCountries(continent);
        assertThat(countries).isNotNull().containsExactly(country);
    }
}
