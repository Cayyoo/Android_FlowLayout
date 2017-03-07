# 打造Android中的流式布局和热门标签

```java
/**
 * 自定义ViewGroup
 * 1、onMeasure：测量子View的宽和高，设置自己的宽和高
 * 2、onLayout：设置子View的位置
 *
 * onMeasure：根据子Viwe的布局文件，为子View设置测量模式和测量值
 *
 * 测量=测量模式+测量值；
 *
 * 测量模式：3种
 * 1、EXACTLY
 * 2、AT_MOST
 * 3、UNSPECIFIED
 *
 * LayoutParams的类型由它的父控件决定。父控件是xxx类型返回的就是xxx.LayoutParams
 */
```

![哈哈](https://github.com/ykmeory/FlowLayout/blob/master/screenshot.jpg "截图")
