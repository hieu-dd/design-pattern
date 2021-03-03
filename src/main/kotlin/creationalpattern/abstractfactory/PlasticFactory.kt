package creationalpattern.abstractfactory

class PlasticFactory : FurnitureAbstractFactory() {
    override fun createChair(): Chair {
        return PlasticChair()
    }

    override fun createTable(): Table {
        return PlasticTable()
    }
}