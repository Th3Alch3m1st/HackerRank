        fun sockMerchant(n: Int, ar: Array<Int>): Int {
            var totalPair = 0
            val hashMap = HashMap<Int,Int>()
            ar.forEach { sock->
                hashMap[sock]?.let {
                    hashMap.replace(sock,it+1)
                } ?: run{
                    hashMap.put(sock,1)
                }
            }
            for (value in hashMap.values){
                totalPair+=value/2
            }
            return totalPair
        }
