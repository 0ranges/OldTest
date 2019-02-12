package leetcode.medium;

import java.awt.*;
import java.util.HashSet;

/**
 * @author : oranges
 * @title : leetcode.medium
 * @date : 2019/2/12 21:19
 * @description :
 */
public class Q963 {
    public double minAreaFreeRect(int[][] points) {
        int n = points.length;
        Point[] ps = new Point[n];
        double ans = Double.MAX_VALUE;
        HashSet<Point> set = new HashSet<>();
        for (int i = 0; i < n; ++i) {
            ps[i] = new Point(points[i][0], points[i][1]);
            set.add(ps[i]);
        }
        for(int i = 0;i < n;i ++){
            Point p1 = ps[i];
            for (int j = 0; j < n; ++j) {
                if (j != i) {
                    Point p2 = ps[j];
                    for (int k = j + 1; k < n; ++k) {
                        if (k != i) {
                            Point p3 = ps[k];
                            Point p4 = new Point(p2.x + p3.x - p1.x, p2.y + p3.y - p1.y);
                            if (set.contains(p4)) {
                                int dot1 = ((p2.x - p1.x) * (p3.x - p1.x) + (p2.y - p1.y) * (p3.y - p1.y));
                                if (dot1 == 0) {
                                    double area = p1.distance(p2) * p1.distance(p3);
                                    if (area < ans) {
                                        ans = area;
                                    }
                                } else {
                                    int dot2 = ((p2.x - p1.x) * (p2.x - p3.x) + (p2.y - p1.y) * (p2.y - p3.y));
                                    if (dot2 == 0) {
                                        double area = p2.distance(p1) * p2.distance(p3);
                                        if (area < ans) {
                                            ans = area;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return ans < Double.MAX_VALUE ? ans : 0;
    }
}
