package collections_review.views;

import collections_review.controllers.CandidatesController;

public class Views {

    public static void main(String[] args) {
        CandidatesController candidatesController = new CandidatesController();
        candidatesController.constructorList();
        candidatesController.displayMenu();
    }
}
