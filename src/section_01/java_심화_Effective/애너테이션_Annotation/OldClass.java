package section_01.java_심화_Effective.애너테이션_Annotation;

public class OldClass {
    public static void main(String[] args) {
        OlderClass olderClass = new OlderClass();
        System.out.println(olderClass.getOldField());
    }
}

class OlderClass{

    @Deprecated
    private int oldField;

    @Deprecated
    int getOldField(){
        return oldField;
    }

    /*
        @Deprecated
        - 기존에 사용하던 기술이 다른 기술로 대체되어 기존 기술을 적용한 코드를 더이상 사용하지 않도록 유도하는 경우에 사용
        - 기존의 코드를 다른 코드와의 호환성 문제로 삭제하기 곤란하여, 남겨두어야 하지만 더이상 사용을 권장하지 않을 때 사용
     */
}
