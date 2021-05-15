    fun countingValleys(steps: Int, path: String): Int {
        // Write your code here
        var valley = 0
        var movement = 0
        for (i in 0 until steps) {
            if (path[i] == 'U') {
                ++movement
            } else {
                --movement
                if (movement == -1) {
                    valley++
                }
            }
        }

        return valley
    }
