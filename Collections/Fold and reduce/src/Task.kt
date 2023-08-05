// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> =
    customers.map { it.getOrderedProducts() }.reduce { a, b -> a.intersect(b) }

fun Customer.getOrderedProducts(): Set<Product> =
    orders.flatMap { it.products }.toSet()