package controller;

public class CartController extends BaseController {
    public void emptyCart(){
        SessionInformation.cartInstance.emptyCart();
    }
}
