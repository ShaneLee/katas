class Solution {
public:
    ListNode* mergeKLists(vector<ListNode*>& lists) {
      ListNode* node = NULL;
      priority_queue<int> q;

      for (int i = 0; i<lists.size();i++) {
        node = lists[i];

        while (node != NULL) {
          q.push(node->val);
          node = node->next;
        }
      }

      while (!q.empty()) {
        int val = q.top();
        q.pop();
        node = new ListNode(val, node);
      }

      return node;
        
    }
};
