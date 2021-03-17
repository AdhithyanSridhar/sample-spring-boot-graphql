/*
 * Copyright 2019 Ingo Griebsch
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
package com.github.ingogriebsch.sample.spring.boot.graphql.model;

import static java.util.UUID.randomUUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Continent {

	@Id
	private final String id = randomUUID().toString();

	private String name;
	private Integer area;
	private Long population;

	public Continent() {
		super();
	}

	public Continent(String name, Integer area, Long population) {
		super();
		this.name = name;
		this.area = area;
		this.population = population;
	}

	public Continent(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public String getId() {
		return id;
	}

}
