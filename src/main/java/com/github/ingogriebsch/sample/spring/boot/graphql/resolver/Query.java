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

import java.util.Optional;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.github.ingogriebsch.sample.spring.boot.graphql.model.Continent;
import com.github.ingogriebsch.sample.spring.boot.graphql.repository.ContinentRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

	private final ContinentRepository continentRepository;

	@Autowired
	public Query(ContinentRepository continentRepository) {
		super();
		this.continentRepository = continentRepository;
	}

	public Iterable<Continent> continents() {
		return continentRepository.findAll();
	}

	public Optional<Continent> continentByName(@NonNull String name) {
		return continentRepository.findByName(name);
	}

}
