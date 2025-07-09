h, m = map(int,input().split())
t = int(input())
th = t // 60
tm = t % 60

if (m + tm)> 59:
    if (h + th + (m+tm) // 60) > 23:
        print((h + th + (m+tm) // 60) - 24, m+tm - 60)
    else:
        print((h + th + (m+tm) // 60),(m+tm - 60))
else:
    if h + th >23:
        print(h + th -24, m + tm)
    else:
        print(h + th, m + tm)

