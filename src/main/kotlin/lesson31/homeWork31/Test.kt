package lesson31.homeWork31
//Создай реализацию представленного ниже интерфейса с пустыми методами.
// Создай тестовый класс для твоей реализации. Для каждого метода напиши набор юнит тестов,
// которые будут покрывать те требования к методу, что перечислены в документации к методу интерфейса.
// После написания тестов к методу напиши его реализацию и выполни тесты.
// Если тесты найдут ошибку - исправь. В этом упражнении старайся придерживаться подхода Test Driven Development - сначала тесты, потом реализация.
//Обратите внимание при сравнении двух дробных float значений:
// рассчётное значение может быть 1.10038 вместо 1.1 - это особенность расчёта значений с плавающей точкой.
// Чтобы такие значения сравнить нужно использовать проверку на равенство с дельтой,
// которая передаётся третьим аргументом в assertEquals, достаточно значения 0.01

//interface Testinterface CerealStorage {
//  val containerCapacity: Float
////    /*
//     // Объём одного контейнера
//     // @throws IllegalArgumentException если значение отрицательное при инициализации
//
//
//
//    /*
//     * Совокупный объём хранилища
//     * @throws IllegalArgumentException если значение меньше, чем [containerCapacity] при инициализации
//     */
//    val storageCapacity: Float
//
//    /*
//     * @param cereal крупа для добавления в контейнер
//     * @param amount количество добавляемой крупы
//     * @return количество оставшейся крупы если контейнер заполнился
//     * @throws IllegalArgumentException если передано отрицательное значение
//     * @throws IllegalStateException если хранилище не позволяет разместить ещё один контейнер для новой крупы
//     */
//    fun addCereal(cereal: Cereal, amount: Float): Float
//
//    /*
//     * @param cereal крупа, которую нужно взять из контейнера
//     * @param amount количество крупы
//     * @return количество полученной крупы или остаток, если было меньше
//     * @throws IllegalArgumentException если передано отрицательное значение
//     */
//    fun getCereal(cereal: Cereal, amount: Float): Float
//
//    /*
//     * @param cereal уничтожает пустой контейнер
//     * @return true если контейнер уничтожен и false если контейнер не пуст
//     */
//    fun removeContainer(cereal: Cereal): Boolean
//
//    /*
//     * @param cereal крупа, количество которой нужно узнать
//     * @return количество крупы, которое хранится в контейнере
//     */
//    fun getAmount(cereal: Cereal): Float
//
//    /*
//     * @param cereal крупа, для которой нужно проверить доступное место в контейнере
//     * @return количество крупы, которое может вместить контейнер с учётом его текущей заполненности
//     */
//    fun getSpace(cereal: Cereal): Float
//
//    /*
//     * @return текстовое представление
//   //  */override fun toString(): String
//}

enum class Cereal(val local: String) {
    BUCKWHEAT("Гречка"),
    RICE("Рис"),
    MILLET("Пшено"),
    PEAS("Горох"),
    BULGUR("Булгур")
}

//class CerealStorageImpl(
//    override val containerCapacity: Float,
//    override val storageCapacity: Float
//) : CerealStorage {
//
//    init {
//        require(containerCapacity >= 0) { "Объём контейнера не может быть отрицательным" }
//        require(storageCapacity >= containerCapacity) { "Совокупный объём хранилища не может быть меньше объёма одного контейнера" }
//    }
//
//    private val containers = mutableMapOf<Cereal, Float>()
//
//    override fun addCereal(cereal: Cereal, amount: Float): Float {
//        require(amount >= 0) { "Количество добавляемой крупы не может быть отрицательным" }
//
//}
//


//Пример имплементации интерфейса с блоком инициализации класса

//class CerealStorageImpl(
//    override val containerCapacity: Float,
//    override val storageCapacity: Float
//) : CerealStorage {
//
//
//    // Блок инициализации класса. Выполняется сразу при создании объекта
//    init {
//        require(containerCapacity >= 0) {
//            "Ёмкость контейнера не может быть отрицательной"
//        }
//        require(storageCapacity >= containerCapacity) {
//            "Ёмкость хранилища не должна быть меньше ёмкости одного контейнера"
//        }
//    }
//
//    private val storage = mutableMapOf<Cereal, Float>()
//
//    // дальше будет переопределением методов интерфейса
//}
//
//{
//}