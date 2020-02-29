fun main() {
    val user = Profile(0, "top1", name = "Vasia", surname = "Pupkin", status = "vip", avatar = 334442)
    println(user.fullname)
    val user0 = Profile(1, "friendBatman", name = "Super", surname = "Man", status = "gud", avatar = 111111)
    println(user0.fullname)
}