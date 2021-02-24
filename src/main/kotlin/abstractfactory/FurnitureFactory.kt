package abstractfactory

object FurnitureFactory {
    fun getFurnitureFactory(type: MaterialType): FurnitureAbstractFactory {
        return when (type) {
            MaterialType.PLASTIC -> PlasticFactory()
            MaterialType.WOOD -> WoodFactory()
            else -> throw IllegalArgumentException("Invalid type")
        }
    }
}

enum class MaterialType {
    PLASTIC,
    WOOD
}

fun main() {
    val factory = FurnitureFactory.getFurnitureFactory(MaterialType.PLASTIC)
    val plasticChair = factory.createChair()
    val plasticTable = factory.createTable()
}