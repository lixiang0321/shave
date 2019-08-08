package net.shavedog.api.fallback;

/**
 * 服务降级功能回退
 */
//@Component
public class DeptServiceFallbackFactory {       //implements FallbackFactory<IDeptService> {
//    @Override
//    public IDeptService create(Throwable throwable) {
//        return new IDeptService() {
//            @Override
//            public DeptDTO add(DeptDTO dto) {
//                dto.setDeptno(-99L);
//                dto.setDname("【Fallback】" + dto.getDname());
//                dto.setLoc("【Fallback】" + dto.getLoc());
//                return null;
//            }
//
//            @Override
//            public List<DeptDTO> list() {
//                return new ArrayList<DeptDTO>();
//            }
//
//            @Override
//            public DeptDTO get(long id) {
//                DeptDTO dto = new DeptDTO() ;
//                dto.setDeptno(id);
//                dto.setDname("【Fallback】没有部门名称");
//                dto.setLoc("【Fallback】没有部门位置");
//                return dto ;
//            }
//        };
//    }
}
