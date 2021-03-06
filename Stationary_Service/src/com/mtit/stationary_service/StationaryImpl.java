package com.mtit.stationary_service;

public class StationaryImpl implements Stationary{

	@Override
	public int calculateBill(int qty, int price) {
		int sub = qty * price;
		return sub;
	}

	@Override
	public void DisplayStationeries() {
		System.out.println("code\tItem\tPrice");
		System.out.println("1\tA4Paper-White\t"+Stationary.A4paper_white);
		System.out.println("2\tA4Paper-Color\t"+Stationary.A4paper_color);
		System.out.println("3\tScissores\t"+Stationary.Scisores);
		System.out.println("4\tPencil\t"+Stationary.Pencil);
		System.out.println("5\tErasor\t"+Stationary.Erasor);
		System.out.println("6\tSingleRule-Books\t");
		System.out.println("7\tSqureRule-Books\t");
		System.out.println("8\tNoteBook\t");
		System.out.println("9\tPens\t");
		
		
	}

	@Override
	public void DisplayExerciseBookSingleRule() {
		System.out.println("code\tItem\tPrice");
		System.out.println("1\tExerciseBook-80Page\t"+Stationary.ExerciseBook_80Page);
		System.out.println("2\tExerciseBook-120Page\t"+Stationary.ExerciseBook_120Page);
		System.out.println("3\tExerciseBook-160Page\t"+Stationary.ExerciseBook_160Page);
		System.out.println("4\tExerciseBook-200Page\t"+Stationary.ExerciseBook_200Page);
		System.out.println("5\tExerciseBook-240Page\t"+Stationary.ExerciseBook_240Page);
		System.out.println("6\tCRBook-80Page\t"+Stationary.CRBook_80page);
		System.out.println("7\tCRBook-120Page\t"+Stationary.CRBook_120page);
		System.out.println("8\tCRBook-160Page\t"+Stationary.CRBook_160page);
		System.out.println("9\tCRBook-200Page\t"+Stationary.CRBook_200page);
		System.out.println("10\tCRBook-240Page\t"+Stationary.CRBook_240page);
		
	}

	@Override
	public void DisplayExerciseBookSqureRule() {
		System.out.println("code\tItem\tPrice");
		System.out.println("1\tExerciseBook-80Page\t"+Stationary.ExerciseBook_80Page);
		System.out.println("2\tExerciseBook-120Page\t"+Stationary.ExerciseBook_120Page);
		System.out.println("3\tExerciseBook-160Page\t"+Stationary.ExerciseBook_160Page);
		System.out.println("4\tExerciseBook-200Page\t"+Stationary.ExerciseBook_200Page);
		System.out.println("5\tExerciseBook-240Page\t"+Stationary.ExerciseBook_240Page);
		System.out.println("6\tCRBook-80Page\t"+Stationary.CRBook_80page);
		System.out.println("7\tCRBook-120Page\t"+Stationary.CRBook_120page);
		System.out.println("8\tCRBook-160Page\t"+Stationary.CRBook_160page);
		System.out.println("9\tCRBook-200Page\t"+Stationary.CRBook_200page);
		System.out.println("10\tCRBook-240Page\t"+Stationary.CRBook_240page);
		
	}

	@Override
	public void NoteBook() {
		System.out.println("code\tItem\tPrice");
		System.out.println("1\tNoteBook-40Page\t"+Stationary.NoteBook_40page);
		System.out.println("2\tNoteBook-80Page\t"+Stationary.NoteBook_80page);
		System.out.println("3\tNoteBook-120Page\t"+Stationary.NoteBook_120page);
		
	}

	@Override
	public void AtlesPen() {
		System.out.println("code\tItem\tPrice");
		System.out.println("1\tBollPoint-Pen-Atlas\t"+Stationary.Pen_Atlas_Bollpoint);
		System.out.println("2\tButterGel-Pen-Atlas\t"+Stationary.Pen_Atlas_ButterGel);
		System.out.println("3\tGel-Atlas\t"+Stationary.Pen_Atlas_Gell);
		System.out.println("4\tBollPoint-Pen-Linc\t"+Stationary.Pen_linc_Bollpoint);
		System.out.println("5\tGel-Linc\t"+Stationary.Pen_linc_Gel);
		System.out.println("6\tBollPoint-Pen-Ten\t"+Stationary.Pen_Ten_Bollpoint);
		System.out.println("7\tGel-Ten\t"+Stationary.Pen_Ten_Gel);
	}

	
}
