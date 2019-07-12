/*
 * Copyright (C) 2018 Conductor Tecnologia SA
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.conductor.heimdall.api;

import br.com.conductor.heimdall.api.environment.JwtProperty;
import br.com.conductor.heimdall.core.environment.Property;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

/**
 * Since Heimdall is a SpringBoot application.
 *
 * @author Marcos Filho
 * @see <a href="https://projects.spring.io/spring-boot/">https://projects.spring.io/spring-boot/</a>
 * 
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableConfigurationProperties({ Property.class, JwtProperty.class})
@ComponentScan(basePackages = { "br.com.conductor.heimdall.api", "br.com.conductor.heimdall.core" })
@EntityScan({"br.com.conductor.heimdall.core.entity", "br.com.conductor.heimdall.api.entity"})
@EnableRedisRepositories({"br.com.conductor.heimdall.core.repository", "br.com.conductor.heimdall.api.repository"})
public class ApiApplication {

     public static void main(String[] args) {

          SpringApplication.run(ApiApplication.class, args);
     }
     
}