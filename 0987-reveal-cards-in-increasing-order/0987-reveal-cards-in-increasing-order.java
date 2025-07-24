
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck); // Step 1: Sort the deck

        Deque<Integer> queue = new LinkedList<>();

        // Step 2: Traverse from largest to smallest
        for (int i = deck.length - 1; i >= 0; i--) {
            if (!queue.isEmpty()) {
                // Move last to front (reverse of putting second card at bottom)
                queue.addFirst(queue.pollLast());
            }

            // Add current card to front
            queue.addFirst(deck[i]);
        }

        // Convert queue to array
        int[] result = new int[deck.length];
        int i = 0;
        for (int card : queue) {
            result[i] = card;
            i++;
        }

        return result;
    }
}
