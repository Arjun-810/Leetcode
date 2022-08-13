class Solution {
    
    public List<Integer> findSubstring(String s, String[] w) {
        Map<String,Integer> nm=new LinkedHashMap<>();
        int a[]=new int[w.length];
        for(String p:w)
        {
            nm.put(p, nm.getOrDefault(p,0)+1);
        }
        int x=0;
        for(String p:nm.keySet())
        {
            a[x++]=nm.get(p);
        }
        int k=s.length(),c=w[0].length();
        List<Integer> f=new ArrayList<>();
        for(int i=0;i<=k-((w.length*c));i++)
        {
            StringBuilder kk=new StringBuilder();
            kk.append(s.substring(i,i+(w.length*c)));
            int j;
            for(j=i;j<i+(w.length*c);j+=c)
            {
                if(nm.containsKey(s.substring(j,j+c)))
                {
                    if(nm.get(s.substring(j,j+c))>0)
                    {
                        nm.put(s.substring(j,j+c), nm.get(s.substring(j,j+c))-1);
                    }
                    else
                    {
                        break;
                    }
                }
                else
                {
                    break;
                }
            }
            if(j==i+(w.length*c))
                f.add(i);
            j=0;
            for(String p:nm.keySet())
            {
                nm.put(p, a[j]);
                j++;
            }
        }
        return f;
    }
}