/*package org.samsung.ktra.controller;


import com.google.gson.Gson;
import org.samsung.ktra.repositories.ProductRepository;
import org.samsung.ktra.repositories.models.OrderDetail;
import org.samsung.ktra.repositories.models.Product;
import org.samsung.ktra.repositories.models.Order;
import org.samsung.ktra.repositories.models.OrderDetail;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShoppingController {
    private final String SHOPPING_CART_SESSION = "shoping_cart";
    @Autowired
    private ProductRepository productRepository;
    @PostMapping("/shopping/addtocart")
    public String AddToCart(Long productId, HttpSession session)
    {
        Gson gson = new Gson();
        //Get shopping cart from session
        String cartInJson = (String) session.getAttribute(SHOPPING_CART_SESSION);
        Order cart=null;
        //khoi tao neu chua co
        if(cartInJson==null)
            cart = new Order();
        else
        {
            cart =gson.fromJson(cartInJson, Order.class);
        }
        Product product = productRepository.getProductById(productId);
        OrderDetail cartItem = new OrderDetail();
        cartItem. = product;
        cartItem.qty =1;
        cart.user.add(cartItem);


        session.setAttribute(SHOPPING_CART_SESSION, gson.toJson(cart));
        return "redirect:/shopping/view";
    }

    @GetMapping("/shopping/view")
    public String ViewShopping(final Model model, HttpSession session)
    {
        Gson gson = new Gson();
        String cartInJson = (String) session.getAttribute(SHOPPING_CART_SESSION);
        OrderDetail cart = gson.fromJson(cartInJson, OrderDetail.class);

        model.addAttribute("cart", cart);
        return "shoppingcart";
    }
}*/
package org.samsung.ktra.controller;

import com.google.gson.Gson;
import org.samsung.ktra.repositories.ProductRepository;
import org.samsung.ktra.repositories.models.OrderDetail;
import org.samsung.ktra.repositories.models.Product;
import org.samsung.ktra.repositories.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class ShoppingController {
    private final String SHOPPING_CART_SESSION = "shopping_cart";

    @Autowired
    private ProductRepository productRepository;

    /*@PostMapping("/shopping/addtocart")
    public String addToCart(@RequestParam Long productId, HttpSession session) {
        Gson gson = new Gson();

        // Retrieve shopping cart from session
        String cartInJson = (String) session.getAttribute(SHOPPING_CART_SESSION);
        List<OrderDetail> cart = cartInJson == null ? new ArrayList<>() : gson.fromJson(cartInJson, List.class);

        // Retrieve the product
        Product product = productRepository.findById(productId).orElse(null);
        if (product == null) {
            return "redirect:/shopping/view?error=ProductNotFound";
        }

        // Create or update cart item
        boolean itemExists = false;
        for (OrderDetail item : cart) {
            if (item.getProduct().getId().equals(productId)) {
                item.setQty(item.getQty() + 1);
                itemExists = true;
                break;
            }
        }

        if (!itemExists) {
            OrderDetail cartItem = new OrderDetail();
            cartItem.setProduct(product);
            cartItem.setQty(1);
            cart.add(cartItem);
        }

        session.setAttribute(SHOPPING_CART_SESSION, gson.toJson(cart));
        return "redirect:/shopping/view";
    }*/

    @GetMapping("/shopping/view")
    public String viewShoppingCart(Model model, HttpSession session) {
        Gson gson = new Gson();
        String cartInJson = (String) session.getAttribute(SHOPPING_CART_SESSION);
        List<OrderDetail> cart = cartInJson == null ? new ArrayList<>() : gson.fromJson(cartInJson, List.class);

        model.addAttribute("cart", cart);
        return "shoppingcart";
    }
}

