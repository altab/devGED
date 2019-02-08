package fr.pcohen.business

class Tag(tag: String?) {
    
    private var tag: String? = null

    init {
        this.tag = tag
    }

    fun getTag(): String? {
        return tag
    }

    private fun setTag(tag: String?) {
        this.tag = tag
    }

      
    override fun toString() = "{Tag[Name : " + this.tag + "]}"
    
}