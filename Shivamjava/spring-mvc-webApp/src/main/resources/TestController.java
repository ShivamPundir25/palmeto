
@Controller
@RequestMapping("/hellod")
public class TestController {

	@RequestMappping("/h3")
	public String getMessage1()
	{
		return "hello1"
	}
	
	@RequestMappping("/h4")
	public String getMessage2()
	{
		return "hello2"
	}
}
