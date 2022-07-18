class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int t = 0;
        if((n+m)%2 == 0) t = (n+m)/2+1;
        else t = (n+m+1)/2;
        int i=0,j=0,k=0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(k<t && i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                arr.add(nums1[i]);
                i++;
            }else{
                arr.add(nums2[j]);
                j++;
            }
            k++;
        }
                System.out.println(arr);
        while(k<t && i<nums1.length){
            arr.add(nums1[i]);
            i++;
            k++;
        }
        while(k<t && j<nums2.length){
            arr.add(nums2[j]);
            j++;
            k++;
        }
        System.out.println(arr);
        if((n+m)%2 == 0){
            return (double)(arr.get(arr.size()-1)+arr.get(arr.size()-2))/2;
        }
        else return (double)arr.get(arr.size()-1);
    }
}