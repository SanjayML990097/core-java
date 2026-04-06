class StateElection {
    String partyNames[] = new String[7];
    int index;

    public boolean addParty(String party) {
        boolean isPartyAdded = false;
        if (party != null && !party.isEmpty()) {
    partyNames[index++] = party;
            isPartyAdded = true;
        } else {
            System.out.println("party not added");
        }
        return isPartyAdded;
    }
    public boolean updateParty(String oldParty, String newParty) {
        boolean isUpdated = false;

        if (oldParty != null && newParty != null) {
            for (int i = 0; i < partyNames.length; i++) {
                if (partyNames[i] != null && partyNames[i].equals(oldParty)) {
                    partyNames[i] = newParty;
        isUpdated = true;
                    break;
         }
            }
        }

        if (!isUpdated) {
            System.out.println("party not found for update");
        }

        return isUpdated;
    }
    public boolean deleteParty(String party) {
        boolean isDeleted = false;

        if (party != null) {
            for (int i = 0; i < partyNames.length; i++) {
                if (partyNames[i] != null && partyNames[i].equals(party)) {
                    partyNames[i] = null;
      isDeleted = true;
                    break;
                }
            }
        }

        if (!isDeleted) {
            System.out.println("party not found for delete");
        }

        return isDeleted;
    }

    public void getParties() {
        System.out.println("the political parties are :");
        for (String party : partyNames) {
            System.out.println(party);
        }
    }
}

