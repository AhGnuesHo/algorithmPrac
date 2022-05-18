x, y, w, h = map(int,input().split())
print(min(min(abs(x-w),abs( x-0)),min(abs(y-h),abs(y-0))))