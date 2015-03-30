package sk.rulemodule.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sk.rulemodule.bo.Rule;
import sk.rulemodule.service.RuleService;

@Controller
@RequestMapping("/rulemodule")
public class RuleModuleRestController {

	@Autowired
	RuleService ruleService;
	
	@RequestMapping(value = "/checkNextRule", method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody String getNextRule() {
		System.out.println("RuleModule: REST: received checkNextRule");
		//:TODO - use RuleService
		//return new Rule("match(n)-[r]->(m) return n.name, type(r), m.name");
		//return "match(n)-[r]->(m) return n.name, type(r), m.name";
		return "match (n:TestNode1 {name: 'name1_681_0'})-[*]->(m:TestNode5) return n.name, m.name";
		//return "match(n {name: 'Keanu Reeves'})-[r:ACTED_IN]->(m:Movie) return distinct 'OK' as result";
	}
}
