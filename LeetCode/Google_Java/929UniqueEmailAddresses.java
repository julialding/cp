class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> result = new HashSet<String>();
        for (int i = 0; i < emails.length; i++) {
            String current = emails[i];
            String prefix = current.substring(0, current.indexOf('@'));
            prefix = prefix.replace(".", "");
            System.out.println(prefix.indexOf('+'));
            if (prefix.indexOf('+') != -1) prefix = prefix.substring(0, prefix.indexOf('+'));
            String postfix = current.substring(current.indexOf('@')+1);
            String email = prefix + "@" + postfix;
            if (!result.contains(email)) result.add(email);
        }
        return result.size();
    }
}