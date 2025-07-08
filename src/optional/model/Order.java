package optional.model;

public class Order {

    private Long id;
    private Delivery delivery;


    public Order(final Long id, final Delivery delivery) {
        this.id = id;
        this.delivery = delivery;
    }

    public Long getId() {
        return id;
    }

    public Delivery getDelivery() {
        return delivery;
    }
}
