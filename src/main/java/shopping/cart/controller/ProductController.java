package shopping.cart.controller;
	
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.servlet.ModelAndView;

	import shopping.cart.repository.ProductRepository;
	import shopping.cart.entity.CartItems;
	import shopping.cart.entity.*;
	

	@Controller
	public class ProductController {
		

		@Autowired
		private ProductRepository productData;
		
		//

		 @PostMapping("/addToCart/{carId}")
		 public String addToCart(@PathVariable Long carId, @ModelAttribute CartItems cartItems, Principal principal){

		     //to save to cartItem table.
		     cartService.addToCart(carId, cartItems, principal.getName());
		     
		     // call the shop  -> add method.

		     return "products";
		 }

		 @GetMapping("/myCart")
		 public  String myCart ( @AuthenticationPrincipal Principal principal, Model model){

		    List<CartItems> cartItems =  cartService.myCart(principal.getName());
		    model.addAttribute("cartItems",cartItems);
		     return "myCart";
		 }
	
