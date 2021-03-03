package creationalpattern.singleton

class Singleton private constructor() {
    companion object {
        private var instance: Singleton? = null
        fun getInstance(): Singleton {
            if (instance == null) {
                instance = Singleton()
            }
            return instance ?: throw Exception("LazyInitialization not init")
        }
    }
}