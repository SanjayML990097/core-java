class YouTube {
    String videoTitleNames[] = new String[15];
    int index;

    public boolean addVideo(String title) {
        boolean isVideoAdded = false;
        if (title != null && !title.isEmpty()) {
            videoTitleNames[index++] = title;
            isVideoAdded = true;
        } else {
            System.out.println("video not added");
        }
        return isVideoAdded;
    }

    public boolean updateVideo(String oldTitle, String newTitle) {
        boolean isUpdated = false;
     if (oldTitle != null && newTitle != null) {
         for (int i = 0; i < videoTitleNames.length; i++) {
          if (videoTitleNames[i] != null && videoTitleNames[i].equals(oldTitle)) {
                    videoTitleNames[i] = newTitle;
             isUpdated = true;
                    break;
                }
            }
        }
     if (!isUpdated) {
            System.out.println("video not found for update");
        }

        return isUpdated;
    }

    public boolean deleteVideo(String title) {
    boolean isDeleted = false;
        if (title != null) {
         for (int i = 0; i < videoTitleNames.length; i++) {
        if (videoTitleNames[i] != null && videoTitleNames[i].equals(title)) {
            videoTitleNames[i] = null;
             isDeleted = true;
                    break;
                }
            }
        }
        if (!isDeleted) {
            System.out.println("video not found for delete");
        }
        return isDeleted;
    }
    public void getVideos() {
        System.out.println("the youtube video titles are :");
        for (String title : videoTitleNames) {
            System.out.println(title);
        }
    }
}

