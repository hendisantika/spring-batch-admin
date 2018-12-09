package com.hendisantika.batch.springbatchtask.job;

import com.hendisantika.batch.springbatchtask.domain.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-batch-admin
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-09
 * Time: 17:22
 * To change this template use File | Settings | File Templates.
 */
public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(Person person) throws Exception {
        Person result = new Person();
        result.setFirstName(person.getFirstName().toUpperCase());
        result.setLastName(person.getLastName().toUpperCase());

        LOGGER.info("converting '{}' into '{}'", person, result);
        return result;
    }
}
