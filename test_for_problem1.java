pm.test("verify the name",function(){
    const response=pm.response.json();
    pm.expect(response[0].name).eql("admin");
    pm.expect(response[0].job).eql("admin");
})
pm.test("verify the name",function(){
    const response=pm.response.json();
    pm.expect(response[1].name).eql("ronaldo");
    pm.expect(response[1].job).eql("player");
})