package java_masterclass.exercise;

public class PaintJob {
	public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
		if (width <= 0 ||
			height <= 0 ||
			areaPerBucket <= 0 ||
			extraBuckets < 0) {
			return -1;
		}
		
		double area = width * height;
		
		if (extraBuckets != 0) {
			area -= areaPerBucket * extraBuckets;
		}
		
		return getBucketCount(area, areaPerBucket);
	}
	
	public static int getBucketCount (double width, double height, double areaPerBucket) {
		if (width <= 0 ||
			height <= 0 ||
			areaPerBucket <= 0) {
			return -1;
		}
		
		double area = width * height;
		
		return getBucketCount(area, areaPerBucket);
	}
	
	public static int getBucketCount (double area, double areaPerBucket) {
		if (area <= 0 || areaPerBucket <= 0) {
			return -1;
		}
		
		area /= areaPerBucket;
		
		return (int)Math.ceil(area);
	}
}
