class Profile(private val id: Long,
              private val login: String,
              private val name: String,
              private val surname: String,
              private val status: String,
              private val avatar: Long
) {
    var fullname: String = "$name $surname"
        get
}