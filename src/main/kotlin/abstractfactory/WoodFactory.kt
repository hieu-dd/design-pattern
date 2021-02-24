package abstractfactory

class WoodFactory : FurnitureAbstractFactory() {
    override fun createChair(): Chair {
        return WoodChair()
    }

    override fun createTable(): Table {
        return WoodTable()
    }
}