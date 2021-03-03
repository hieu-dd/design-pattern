package creationalpattern.builder

class ProductBuilder {
    private var name: String = ""
    private var sku: String = ""
    private var price: String = ""
    private var seller: String = ""
    private var quantity: Int = 0

    fun name(name: String): ProductBuilder = apply { this.name = name }
    fun sku(sku: String): ProductBuilder = apply { this.sku = sku }
    fun price(price: String): ProductBuilder = apply { this.price = price }
    fun seller(seller: String): ProductBuilder = apply { this.seller = seller }
    fun quantity(quantity: Int): ProductBuilder = apply { this.quantity = quantity }

    fun build(): Product = Product(name, sku, price, seller, quantity)
}

fun main() {
    val product = ProductBuilder()
        .name("")
        .price("")
        .quantity(1)
        .seller("")
        .sku("")
        .build()
}