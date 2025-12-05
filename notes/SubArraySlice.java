// 	 public static void subset(int a[], int f, int e) {


// 	        int[] b = new int[e - f];
// 	        int j = 0;
// 	        for (int i = f; i < e; i++) {
// 	            b[j] = a[i];
// 	            j++;
// 	        }

// 	        for (int x : b) {
// 	            System.out.println(x);
// 	        }
// 	    }

// 	    public static void main(String[] args) {
// 	        Scanner sc = new Scanner(System.in);

// 	        System.out.print("Enter size of array: ");
// 	        int n = sc.nextInt();

// 	        int[] a = new int[n];
// 	        System.out.println("Enter array elements:");
// 	        for (int i = 0; i < n; i++) {
// 	            a[i] = sc.nextInt();
// 	        }

// 	        System.out.print("Enter start index f: ");
// 	        int f = sc.nextInt();

// 	        System.out.print("Enter end index e: ");
// 	        int e = sc.nextInt();

// 	        subset(a, f, e);
// 	    }

