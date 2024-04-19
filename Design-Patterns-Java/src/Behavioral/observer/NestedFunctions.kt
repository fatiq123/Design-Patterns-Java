package Behavioral.observer

fun main() {
    fun saveUser(user: User) {
        fun validate(user: User ,value: String, fieldName: String) {
            require(value.isNotEmpty()) {
                "Can't save user ${user.id}: empty $fieldName"
            }
        }

        validate(user, user.name, "Name")
        validate(user, user.address, "Address")
    }
}

class User(val id: Int, val name: String, val address: String)

