package ii_collections

fun example2(list: List<Int>) {

    val isZero: (Int) -> Boolean = { it == 0 }

    val hasZero: Boolean = list.any(isZero)

    val allZeros: Boolean = list.all(isZero)

    val numberOfZeros: Int = list.count(isZero)

    val firstPositiveNumber: Int? = list.firstOrNull { it > 0 }
}

fun Customer.isFrom(city: City): Boolean {
    // Return true if the customer is from the given city
    return this.city == city
}

fun Shop.checkAllCustomersAreFrom(city: City): Boolean {
    // Return true if all customers are from the given city
    return this.customers.filter { it.city == city }.count() == this.customers.count()
}

fun Shop.hasCustomerFrom(city: City): Boolean {
    // Return true if there is at least one customer from the given city
    return this.customers.filter { it.city == city }.count() > 0
}

fun Shop.countCustomersFrom(city: City): Int {
    return this.customers.filter { it.city == city }.count()
}

fun Shop.findAnyCustomerFrom(city: City): Customer? {
    return this.customers.find { it.city == city }
}
