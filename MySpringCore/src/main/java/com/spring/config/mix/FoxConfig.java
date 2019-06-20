package com.spring.config.mix;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(WolfConfig.class)
@ImportResource("DragonConfig.xml")
public class FoxConfig {

	@Bean
	public Fox getFox()
	{
		Fox f = new Fox();
		f.setColor("sdfghjk");
		f.setName("zxcvbn");
		return f;
	}
}