def hanoi(height, from_='left', to='right', through='middle'):
    if height:
        hanoi(height - 1, from_, through, to)
        print(f'{from_} => {to}')
        hanoi(height - 1, through, to, from_)


hanoi(4)