fun alternatingCharacters(s: String): Int {
            var deletion = 0
            val length = s.length
            var previousChar:Char?=null
            for (i in 0 until length){
                if(s[i] == previousChar){
                    deletion++
                }
                previousChar = s[i]
            }
            return deletion
}
