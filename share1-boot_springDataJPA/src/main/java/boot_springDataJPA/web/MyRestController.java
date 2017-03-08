package boot_springDataJPA.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import boot_springDataJPA.domain.DTO;
import boot_springDataJPA.domain.Person;
import boot_springDataJPA.domain.PersonRepository;
import boot_springDataJPA.domain.UserRepository;

@RestController
public class MyRestController {
	@Autowired
	PersonRepository personRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public Person save(@RequestParam String name, @RequestParam String age, @RequestParam String address) {
		Person p = personRepository.save(new Person(null, name, age, address));
		return p;
	}
	
	@RequestMapping(value = "/q1", method = RequestMethod.GET)
	public List<Person> q1(@RequestParam String address) {
		List<Person> peoples = personRepository.findByAddress(address);
		return peoples;
	}
	
	@RequestMapping(value = "/q2", method = RequestMethod.GET)
	public List<Person> q2(@RequestParam String name, @RequestParam String address) {
		List<Person> people = personRepository.findByNameAndAddress(name, address);
		return people;
	}
	
	@RequestMapping(value = "/q3", method = RequestMethod.GET)
	public List<Person> q3(@RequestParam String name, @RequestParam String address) {
		List<Person> people = personRepository.withNameAndAddressQuery(name, address);
		return people;
	}
	
	@RequestMapping(value = "/sort", method = RequestMethod.GET)
	public List<Person> sort() {
		List<Person> people = personRepository.findAll(new Sort(Direction.ASC,"age"));
		return people;
	}
	
	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public Page<Person> page() {
		Page<Person> pagePeople = personRepository.findAll(new PageRequest(1,2));
		return pagePeople;
	}
	
	@RequestMapping(value = "/multi", method = RequestMethod.GET)
	public List<DTO> multi() {
		return userRepository.test();
	}
}