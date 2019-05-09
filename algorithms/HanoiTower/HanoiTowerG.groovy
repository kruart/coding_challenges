package HanoiTower

def hanoi(height, from='left', to='right', through='middle') {
    if (height > 0) {
        hanoi(height - 1, from, through, to)
        println("$from => $to")
        hanoi(height - 1, through, to, from)
    }
}

hanoi(4)