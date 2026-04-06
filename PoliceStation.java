class PoliceStation {
    String caseNames[] = new String[16];
    int index;

    public boolean addCase(String caseName) {
        boolean isCaseAdded = false;
        if (caseName != null && !caseName.isEmpty()) {
            caseNames[index++] = caseName;
            isCaseAdded = true;
        } else {
            System.out.println("case not added");
        }
        return isCaseAdded;
    }

    public boolean updateCase(String oldCase, String newCase) {
        boolean isUpdated = false;

        if (oldCase != null && newCase != null) {
            for (int i = 0; i < caseNames.length; i++) {
                if (caseNames[i] != null && caseNames[i].equals(oldCase)) {
                    caseNames[i] = newCase;
                    isUpdated = true;
                    break;
                }
            }
        }

        if (!isUpdated) {
            System.out.println("case not found for update");
        }

        return isUpdated;
    }

    public boolean deleteCase(String caseName) {
        boolean isDeleted = false;

        if (caseName != null) {
            for (int i = 0; i < caseNames.length; i++) {
                if (caseNames[i] != null && caseNames[i].equals(caseName)) {
                    caseNames[i] = null;
                    isDeleted = true;
                    break;
                }
            }
        }

        if (!isDeleted) {
            System.out.println("case not found for delete");
        }

        return isDeleted;
    }

    public void getCases() {
        System.out.println("the police cases are :");
        for (String caseName : caseNames) {
            System.out.println(caseName);
        }
    }
}

