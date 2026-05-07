class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        
        int cnt = 0; // 연속 성공
        int attackIndex = 0;
        int time = attacks[attacks.length-1][0]; // 끝나는 시간
        int castTime = bandage[0]; // 시전 시간
        int healPerSecond = bandage[1]; // 초당 회복량
        int extraHealAmount = bandage[2]; // 추가 회복량
        int maxHealth = health; // 최대 채력
        
        for(int i = 1; i <= time; i++) {
            
            // 몬스터 공격 시간 일치할 때
            if(i == attacks[attackIndex][0]) {
                health -= attacks[attackIndex][1];
                cnt = 0;
                attackIndex++;
            }
            
            // 몬스터 공격 시간 아니면(회복시간)
            else {
                health += healPerSecond;
                cnt++;
                // 추가 회복
                if(cnt == castTime) {
                    health += extraHealAmount;
                    cnt = 0;
                }
                // 최대 체력을 넘을 수 없음
                if(maxHealth < health) {
                    health = maxHealth;
                }
            }

            if(health <= 0) {
                return -1;
            }
            
            
        }
        return health;
    }
}