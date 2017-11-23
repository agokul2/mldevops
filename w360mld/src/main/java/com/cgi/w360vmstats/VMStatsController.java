/**
 * 
 */
package com.cgi.w360vmstats;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author ashray.gokul
 *
 */
@RestController
public class VMStatsController {

	
	private static String defaultName = "deault";
	
	@RequestMapping("/vmstats")
	public VMStats vmstats(@RequestParam(value="name",defaultValue="vm1") String vmName) {

	return new VMStats ("stats", vmName, "somevalue");
	}
	

}
