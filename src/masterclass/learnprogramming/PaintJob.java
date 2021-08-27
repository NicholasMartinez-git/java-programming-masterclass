/* Section 5 : Coding Exercise 28: Paint Job */

package masterclass.learnprogramming;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));

        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));

        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
    }

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
        // Width: represents width of wall
        // Height: represents height of wall
        // areaPerBucket: represents area of the wall that can be covered with ONE bucket.
        // extraBuckets: represents the bucket count Bob has at home.

        // Validation
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double areaOfWall = height * width;
        double bucketsNeeded = areaOfWall / areaPerBucket;
        double bucketsBobNeedsToBuy = bucketsNeeded - extraBuckets;

        return (int) Math.ceil(bucketsBobNeedsToBuy);
    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double areaOfWall = height * width;
        double bucketsNeeded = areaOfWall / areaPerBucket;

        return (int) Math.ceil(bucketsNeeded);
    }

    public static int getBucketCount (double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double bucketsNeeded = area / areaPerBucket;

        return (int) Math.ceil(bucketsNeeded);
    }
}
