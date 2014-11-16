package ueb09;

public class MatrixSuche {

	public static class Position {
		private int xPos;
		private int yPos;

		public Position(int xPos, int yPos) {
			this.xPos = xPos;
			this.yPos = yPos;
		}

		public int getxPos() {
			return this.xPos;
		}

		public int getyPos() {
			return this.yPos;
		}

		@Override
		public String toString() {
			return this.xPos + ", " + this.yPos;
		}

	}

	public static Position findEntry(int[][] matrix, int wert) {
		for (int i = 0; i < matrix.length; i++) {
			for (int k = 0; k < matrix[i].length; k++) {
				if (matrix[i][k] == wert) {
					return new Position(i, k);
				}
			}
		}
		return null;
	}

}
