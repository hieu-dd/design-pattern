package abstractfactory

abstract class FurnitureAbstractFactory {
    abstract fun createChair(): Chair
    abstract fun createTable(): Table
}