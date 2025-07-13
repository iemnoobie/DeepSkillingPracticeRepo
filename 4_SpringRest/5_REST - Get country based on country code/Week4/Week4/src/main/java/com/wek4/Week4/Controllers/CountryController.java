package com.wek4.Week4.Controllers;

import com.wek4.Week4.Model.Country;
import com.wek4.Week4.Model.CountryList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/country")
    public Country getCountryIndia(){
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country) context.getBean("country", Country.class);
        return country;
    }
   @GetMapping("/country/{code}")
    public Country getCoutryByID(@PathVariable String code){
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        CountryList countryList = (CountryList) context.getBean("countryList", CountryList.class);
        List<Country> countrylist = countryList.getCountryList();
        for(Country c: countrylist){
            if(c.getCode().equalsIgnoreCase(code)) return c;
        }
        return null;
    }
}
