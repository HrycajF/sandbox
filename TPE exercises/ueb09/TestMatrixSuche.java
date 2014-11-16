package ueb09;

public class TestMatrixSuche {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 },
				{ 11, 12, 13, 14, 15 } };

		System.out.println(MatrixSuche.findEntry(matrix, 3));
		System.out.println(MatrixSuche.findEntry(matrix, 7));
		System.out.println(MatrixSuche.findEntry(matrix, 14));
		System.out.println(MatrixSuche.findEntry(matrix, 28));
		System.out.println(MatrixSuche.findEntry(matrix, 0));

	}

}
